package com.maxim.springproject.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.maxim.springproject.model.RoomDao;
import com.maxim.springproject.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.View;

import java.util.List;

@RestController
@RequestMapping("/room")//обработать запрос если /room
public class RoomController {


    private RoomService roomService;

    @Autowired
    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping(value = "/all")//то же самое что RequestMapping(method=RequestMethod.GET))
    @ResponseBody
    public ResponseEntity<List<RoomDao>> retrieveAll(
            @RequestParam(value = "size") int size,
            @RequestParam(value = "floor") int floor) {//извлечь все
        return ResponseEntity.ok(roomService.findByFS(floor, size));
    }

    @PutMapping("/{roomId}/book")
    public void bookARoom(@PathVariable Long roomId) {
        roomService.bookAroom(roomId);
    }

    @GetMapping("/delete")
    @ResponseBody
    public String retrieve7floor() {
        return roomService.removeAll();
    }


}
