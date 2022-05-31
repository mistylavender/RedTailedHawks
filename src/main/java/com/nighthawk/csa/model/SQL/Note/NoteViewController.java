package com.nighthawk.csa.model.SQL.Note;

import com.nighthawk.csa.ModelRepository;
import com.nighthawk.csa.model.SQL.Student.Student;
import org.commonmark.node.Node;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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
        Student student = modelRepository.get(id);
        List<Note> notes = noteRepository.findAllByStudent(student);
        Note note = new Note();
        note.setStudent(student);

        for (Note n : notes)
            n.setText(convertMarkdownToHTML(n.getText()));

        model.addAttribute("student", student);
        model.addAttribute("notes", notes);
        model.addAttribute("note", note);
        return "mvc/database/notes";
    }

    @PostMapping("/database/notes")
    public String notesAdd(@Valid Note note, BindingResult bindingResult) {
        // back to person ID on redirect
        String redirect = "redirect:/database/notes/"+note.getStudent().getId();

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