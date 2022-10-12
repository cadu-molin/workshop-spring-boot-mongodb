package com.carlosmolin.workshopmongo.services;

import com.carlosmolin.workshopmongo.domain.Post;
import com.carlosmolin.workshopmongo.repositories.PostRepository;
import com.carlosmolin.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    PostRepository postRepository;

    public Post findById(String id) {
        return postRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Post não encontrado"));
    }
}
