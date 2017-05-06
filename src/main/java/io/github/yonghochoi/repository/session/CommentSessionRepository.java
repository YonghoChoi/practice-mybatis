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
    public SqlSessionFactory getSqlSessionFactory() throws IOException {
        String resource = "mybatis-config.xml";

        try (InputStream inputStream = Resources.getResourceAsStream(resource)){
            return new SqlSessionFactoryBuilder().build(inputStream);
        }
    }

    public Comment selectCommentByPrimaryKey(Long commentNo) throws IOException {
        SqlSessionFactory sf = getSqlSessionFactory();
        try(SqlSession sqlSession = sf.openSession()) {
            CommentMapper mapper = sqlSession.getMapper(CommentMapper.class);
            return mapper.selectCommentByPrimaryKey(commentNo);
        }
    }
}
