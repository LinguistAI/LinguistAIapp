package app.linguistai.repository.gamification;

import java.util.UUID;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import app.linguistai.model.UserStreak;

@Repository
public interface IUserStreakRepository extends JpaRepository<UserStreak, UUID> {
    List<UserStreak> findAll();
    Optional<UserStreak> findByUserId(UUID id);
    Optional<UserStreak> findByUserEmail(String email);
}