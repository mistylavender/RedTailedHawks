package com.nighthawk.csa.model.SQL.ArtPiece;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtPieceJpaRepository extends JpaRepository<ArtPiece, Long> {
    ArtPiece findArtPieceByName(String name);
}
