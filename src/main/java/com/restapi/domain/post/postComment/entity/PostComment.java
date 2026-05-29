package com.restapi.domain.post.postComment.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.restapi.domain.post.post.entity.Post;
import com.restapi.global.jpa.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
public class PostComment extends BaseEntity {
    private String content;

    @JsonIgnore
    @ManyToOne
    private Post post;

    public PostComment(Post post, String content) {
        this.post = post;
        this.content = content;
    }

    public void modify(String content) {
        this.content = content;
    }
}
