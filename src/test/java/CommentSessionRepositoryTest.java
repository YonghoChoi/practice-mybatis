import io.github.yonghochoi.model.Comment;
import io.github.yonghochoi.repository.session.CommentSessionRepository;
import org.junit.Test;

import java.io.IOException;
import java.util.Date;

public class CommentSessionRepositoryTest {
    @Test
    public void selectTest() throws IOException {
        Comment comment = CommentSessionRepository.selectCommentByPrimaryKey(1L);
        System.out.println(comment);
    }

    @Test
    public void insertTest() throws IOException {
        Comment comment = new Comment();
        comment.setUserId("test2");
        comment.setCommentContent("test desec");
        comment.setCommentNo(2L);
        comment.setRegDate(new Date());

        CommentSessionRepository.insertComment(comment);
    }
}
