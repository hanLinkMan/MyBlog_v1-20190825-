package life.myblog.community.model;

import lombok.Data;

/**
 * @author hlq
 * @create 2019-07-30 22:22
 */
@Data
public class Question {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
}
