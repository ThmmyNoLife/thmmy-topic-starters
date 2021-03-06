package gr.thmmy.mthmmy.topicstarter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.UUID;

@NoRepositoryBean
public interface GenericRepository<T> extends JpaRepository<T, UUID>, QuerydslPredicateExecutor<T> {
}
