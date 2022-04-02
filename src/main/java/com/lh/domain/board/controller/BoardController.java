package com.lh.domain.board.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController {

    @GetMapping("/board")
    public String boardForm() {

        return "index";
    }

    @ResponseBody
    @PostMapping("/board")
    public ResponseEntity<?> save() {


        return new ResponseEntity<String>("200", HttpStatus.OK);
    }
}
