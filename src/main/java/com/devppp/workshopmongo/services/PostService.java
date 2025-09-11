package com.devppp.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devppp.workshopmongo.domain.Post;
import com.devppp.workshopmongo.repository.PostRepository;
import com.devppp.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

    // Injeta o PostRepository, que é o correto para este serviço
    @Autowired
    private PostRepository repo;

    // Retorna uma lista de Posts, conforme a responsabilidade do serviço
    public List<Post> findAll() {
        return repo.findAll();
    }

    // Usa o PostRepository para buscar um Post pelo ID
    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}