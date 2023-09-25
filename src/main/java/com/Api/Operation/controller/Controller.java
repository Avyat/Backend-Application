package com.Api.Operation.controller;

import com.Api.Operation.text.Text;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.Api.Operation.Service.userService;
import java.util.List;

@CrossOrigin(origins = {"http://localhost:3000/"})
@RestController()
public class Controller {
    @Autowired
    public userService userService;

    @GetMapping("/blog")
    public List<Text> getAllBlog(){
        return userService.getAllBlog();
    }
    @GetMapping("/blog/{Id}")
    public Text getAllBlogById(@PathVariable long Id){
        return userService.getAllBlogById(Id);

    }
    @PostMapping("/blog")
    public Text postAllBlog(@RequestBody Text text){
        return userService.saveAllBlog(text);
    }
    @DeleteMapping("/blog/{Id}")
    public ResponseEntity<HttpStatus> deleteBlogById(@PathVariable String Id){
        try{
            this.userService.deleteBlogById(Long.parseLong(Id));
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e)
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PutMapping("/blog/{Id}")
    public Text updateBlog(@PathVariable Long Id,@RequestBody Text text){
        text.setId(Id);
        return userService.updateBlog(text);
    }

}
