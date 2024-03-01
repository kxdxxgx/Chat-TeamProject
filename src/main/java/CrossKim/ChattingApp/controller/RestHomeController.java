package crossKim.chattingApp.controller;

import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;

@CrossOrigin(origins = { "http://localhost:3000/" })
@RestController
@RequiredArgsConstructor
@RequestMapping("/")
public class RestHomeController {

}
