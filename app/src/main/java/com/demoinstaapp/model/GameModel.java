package com.demoinstaapp.model;


    public class GameModel {


        private String Name;
        private int imageUrl;

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public int getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(int imageUrl) {
            this.imageUrl = imageUrl;
        }

        public GameModel(String name,  int imageUrl){

            this.Name = name;
            this.imageUrl = imageUrl;
        }


    }

