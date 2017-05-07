package io.github.yonghochoi.repository.session;

import io.github.yonghochoi.model.Comment;
import io.github.yonghochoi.repository.mapper.CommentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class CommentSessionRepository {
    static SqlSessionFactory sf;

    static {
        String resource = "mybatis-config.xml";

        try (InputStream inputStream = Resources.getResourceAsStream(resource)){
            sf = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
    }

    public static Comment selectCommentByPrimaryKey(Long commentNo) throws IOException {
        try(SqlSession sqlSession = sf.openSession()) {
            CommentMapper mapper = sqlSession.getMapper(CommentMapper.class);
            return mapper.selectCommentByPrimaryKey(commentNo);
        }
    }

    public static void insertComment(Comment comment) throws IOException {
        try(SqlSession sqlSession = sf.openSession()) {
            CommentMapper mapper = sqlSession.getMapper(CommentMapper.class);
            if(mapper.insertComment(comment) > 0) {
                sqlSession.commit();
            }
        }
    }
}
