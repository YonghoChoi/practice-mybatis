import io.github.yonghochoi.model.Comment;
import io.github.yonghochoi.repository.session.CommentSessionRepository;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.io.IOException;

public class CommentSessionRepositoryTest {
    @Test
    public void classPathTest() throws IOException {
        CommentSessionRepository c = new CommentSessionRepository();
        SqlSessionFactory sf = c.getSqlSessionFactory();
        System.out.println(sf);
    }

    @Test
    public void selectTest() throws IOException {
        CommentSessionRepository c = new CommentSessionRepository();
        Comment comment = c.selectCommentByPrimaryKey(1L);
        System.out.println(comment);
    }
}
