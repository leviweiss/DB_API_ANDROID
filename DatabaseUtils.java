package com.technion.android.joblin;

class DatabaseUtils {
    enum Side {
        LEFT, RIGHT
    }

    static final String BIRTHDAY_KEY = "birthday";
    static final String EMAIL_KEY = "email";
    static final String JOB_CATEGORY_KEY = "jobCategory";
    static final String JOB_LOCATION_KEY = "jobLocation";
    static final String JOB_RADIUS_KEY = "maxDistance";
    static final String LAST_NAME_KEY = "lastName";
    static final String MORE_INFO_KEY = "moreInfo";
    static final String NAME_KEY = "name";
    static final String SCOPE_KEY = "scope";
    static final String SKILLS_KEY = "skillList";
    static final String EDUCATION_KEY = "education";
    static final String NUMBER_OF_SWIPES_LEFT_KEY = "numberOfSwipesLeft";
    static final String NUMBER_OF_SUPER_LIKES_LEFT_KEY = "numberOfSuperLikesLeft";
    static final String REQUIRED_EDUCATION = "requiredEducation";
    static final String REQUIRED_SCOPE_KEY = "requiredScope";
    static final String REQUIRED_SKILLS_KEY = "requiredSkillsList";
    static final String JOB_DESCRIPTION_KEY = "jobDescription";
    static final String SIDE_KEY = "side";
    static final String IMAGE_URL_KEY = "imageUrl";
    static final String TOKEN_KEY = "token";
    static final String ERROR_KEY = "errors";
    static final String CURRENT_TIME_KEY = "time";
    static final String SENDER_KEY = "sender";
    static final String RECEIVER_KEY = "receiver";
    static final String MAX_DISTANCE_KEY = "maxDistance";

    static final String SWIPES_COLLECTION_NAME = "Swipes";
    static final String MATCHES_COLLECTION_NAME = "Matches";
    static final String CANDIDATES_COLLECTION_NAME = "Candidates";
    static final String RECRUITERS_COLLECTION_NAME = "Recruiters";
    static final String JOB_CATEGORIES_COLLECTION_NAME = "JobCategories";
    static final String CHATS_COLLECTION_NAME = "Chats";
    static final String USERS_COLLECTION_NAME = "Users";
    static final String TOKENS_COLLECTION_NAME = "Tokens";
    static final String ERRORS_COLLECTION_NAME = "Errors";
    static final String SCOPES_COLLECTION_NAME = "Scopes";

    static final String TAG = "DatabaseAPI";

}
