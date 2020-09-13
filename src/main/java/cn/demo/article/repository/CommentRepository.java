package cn.demo.article.repository;

import cn.demo.article.entity.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommentRepository extends MongoRepository<Comment, String> {

  Page<Comment> findByParentId(String parentId, Pageable pageable);
}
