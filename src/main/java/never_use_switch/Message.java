package never_use_switch;

import lombok.Builder;
import lombok.Data;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
public class Message {
    private String content;
    private String distributionType;
}
