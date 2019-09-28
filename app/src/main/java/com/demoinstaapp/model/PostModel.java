package com.demoinstaapp.model;

public class PostModel {
    public int userProfile;
    public String userName;
    public String userName2;
    public String userCaption;
    public int PostImage;



    public PostModel(int userProfile, String userName, String userName2, String userCaption, int PostImage) {
        this.userProfile = userProfile;
        this.userName = userName;
        this.userName2 = userName2;
        this.userCaption = userCaption;
        this.PostImage = PostImage;
    }

    public int getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(int userProfile) {
        this.userProfile = userProfile;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName2() {
        return userName2;
    }

    public void setUserName2(String userName2) {
        this.userName2 = userName2;
    }

    public String getUserCaption() {
        return userCaption;
    }

    public void setUserCaption(String userCaption) {
        this.userCaption = userCaption;
    }
    public int getPostImage() {
        return PostImage;
    }

    public void setPostImage(int postImage) {
        PostImage = postImage;
    }






    }


