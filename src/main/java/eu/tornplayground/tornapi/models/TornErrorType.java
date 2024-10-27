package eu.tornplayground.tornapi.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
public enum TornErrorType {
    UNKNOWN_ERROR(0, "Unknown error: Unhandled error, should not occur."),
    KEY_EMPTY(1, "Key is empty: Private key is empty in current request."),
    INCORRECT_KEY(2, "Incorrect Key: Private key is wrong/incorrect format."),
    WRONG_TYPE(3, "Wrong type: Requesting an incorrect basic type."),
    WRONG_FIELDS(4, "Wrong fields: Requesting incorrect selection fields."),
    TOO_MANY_REQUESTS(5, "Too many requests: Current private key is banned for a small period of time because of too many requests (max 100 per minute)."),
    INCORRECT_ID(6, "Incorrect ID: Wrong ID value."),
    INCORRECT_ID_ENTITY_RELATION(7, "Incorrect ID-entity relation: A requested selection is private (For example, personal data of another user / faction)."),
    IP_BLOCK(8, "IP block: Current IP is banned for a small period of time because of abuse."),
    API_DISABLED(9, "API disabled: API system is currently disabled."),
    KEY_OWNER_IN_JAIL(10, "Key owner is in federal jail: Current key can't be used because owner is in federal jail."),
    KEY_CHANGE_ERROR(11, "Key change error: You can only change your API key once every 60 seconds."),
    KEY_READ_ERROR(12, "Key read error: Error reading key from Database."),
    KEY_TEMP_DISABLED(13, "The key is temporarily disabled due to owner inactivity: An inactive player's key may not make API calls after 7 days."),
    DAILY_READ_LIMIT(14, "Daily read limit reached: Too many records have been pulled today by this user from our cloud services."),
    TEMPORARY_ERROR(15, "Temporary error: An error code specifically for testing purposes that has no dedicated meaning."),
    ACCESS_LEVEL_INSUFFICIENT(16, "Access level of this key is not high enough: A selection is being called of which this key does not have permission to access."),
    BACKEND_ERROR(17, "Backend error occurred, please try again."),
    API_KEY_PAUSED(18, "API key has been paused by the owner.");

    private final int code;
    private final String message;

    TornErrorType(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    @JsonCreator
    public static TornErrorType fromMessage(String message) {
        for (TornErrorType error : values()) {
            if (error.getMessage().contains(message)) {
                return error;
            }
        }
        return UNKNOWN_ERROR;
    }

    public static TornErrorType fromCode(int code) {
        for (TornErrorType error : values()) {
            if (error.getCode() == code) {
                return error;
            }
        }
        return UNKNOWN_ERROR;
    }
}
