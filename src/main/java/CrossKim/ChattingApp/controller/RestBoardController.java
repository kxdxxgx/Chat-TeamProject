package crossKim.chattingApp.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@CrossOrigin(origins = { "http://localhost:3000/" })
@RestController
@RequiredArgsConstructor
@RequestMapping("/Board")
public class RestBoardController {

}
