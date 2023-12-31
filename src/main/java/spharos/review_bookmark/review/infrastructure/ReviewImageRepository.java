package spharos.review_bookmark.review.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import spharos.review_bookmark.review.domain.Review;
import spharos.review_bookmark.review.domain.ReviewImage;

import java.util.List;

public interface ReviewImageRepository extends JpaRepository<ReviewImage, Long> {

    List<ReviewImage> findByReview(Review review);

}