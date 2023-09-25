package com.Api.Operation.Service;

import com.Api.Operation.textDao.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import com.Api.Operation.text.Text;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class userServiceImpl implements userService {
    @Autowired
    private Dao userDao;
    @Override
    public List<Text>getAllBlog(){
        return userDao.findAll();
    }
    @Override
    public Text getAllBlogById(long blogId){
        return userDao.findById(blogId).orElse(null);
    }

    @Override
    public Text saveAllBlog(Text blog) {
        return userDao.save(blog);
    }

    @Override
    public void deleteBlogById(long Id) {
        Text text=userDao.getReferenceById(Id);
        userDao.delete(text);
    }

    @Override
    public Text updateBlog(Text text) {
        return userDao.save(text);
    }
}
