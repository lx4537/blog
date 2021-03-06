package com.tfive.blog.dao;

import com.tfive.blog.po.Blog;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BlogRepository extends JpaRepository<Blog,Long>,JpaSpecificationExecutor<Blog>{

    @Query("select b from Blog b where b.recommend = true")
    List<Blog> findRecommend(Pageable pageable);

}
