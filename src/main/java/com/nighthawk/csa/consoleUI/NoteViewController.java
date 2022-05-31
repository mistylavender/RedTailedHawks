package com.nighthawk.csa.consoleUI;

import javax.validation.Valid;
import java.util.List;

@Controller
public class NoteViewController {
    // Autowired enables Control to connect HTML and POJO Object to database easily for CRUD
    @Autowired
    private ModelRepository modelRepository;

    @Autowired
    private NoteJpaRepository noteRepository;

    public static String convertMarkdownToHTML(String markdown) {
        Parser parser = Parser.builder().build();
        Node document = parser.parse(markdown);
        HtmlRenderer htmlRenderer = HtmlRenderer.builder().build();
        return htmlRenderer.render(document);
    }

    @GetMapping("/database/notes/{id}")
    public String notes(@PathVariable("id") Long id, Model model) {
        Person student = modelRepository.get(id);
        List<Note> notes = noteRepository.findAllByPerson(student);
        Note note = new Note();
        note.setPerson(student);

        for (Note n : notes)
            n.setText(convertMarkdownToHTML(n.getText()));

        model.addAttribute("person", student);
        model.addAttribute("notes", notes);
        model.addAttribute("note", note);
        return "mvc/database/notes";
    }

    @PostMapping("/database/notes")
    public String notesAdd(@Valid Note note, BindingResult bindingResult) {
        // back to person ID on redirect
        String redirect = "redirect:/database/notes/"+note.getPerson().getId();

        // database errors
        if (bindingResult.hasErrors()) {
            return redirect;
        }

        // note is saved and person ID is pre-set
        noteRepository.save(note);

        // Redirect to next step
        return redirect;
    }
}
