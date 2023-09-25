package com.Api.Operation.Service;

import com.Api.Operation.text.Text;
import org.springframework.stereotype.Service;

import java.util.List;

public interface userService {
    //Read
    public List<Text> getAllBlog();


    public Text getAllBlogById(long Id);

    //Update the table
    public Text saveAllBlog(Text blog);

    public void deleteBlogById(long Id);

    public Text updateBlog(Text text);
}
