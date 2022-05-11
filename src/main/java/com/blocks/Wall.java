package com.blocks;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Wall {

    private List<Block> blocks;

    Optional<Block> findBlockByColor(String color) {
        return blocks.stream().filter(block -> block.getColor().equals(color)).findFirst();
    }

    List findBlocksByMaterial(String material) {
        return blocks.stream().filter(block -> block.getMaterial().equals(material)).collect(Collectors.toList());
    }

    int count() {
        return blocks.size();
    }
}
