package io.github.yonghochoi.repository.mapper;

import io.github.yonghochoi.model.Comment;

public interface CommentMapper {
    Comment selectCommentByPrimaryKey(Long commentNo);
    int insertComment(Comment comment);
}
