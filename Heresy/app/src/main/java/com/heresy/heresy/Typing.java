package com.heresy.heresy;

public class Typing {

    String story;
    String[] array_story;
    char[] array_story2;

    Typing(String str){
        story = str;
    }

    public String[] string_split(){
        array_story = story.split("");

        for(int i = 0 ; i< array_story.length;i++){
            System.out.println(array_story[i]);
        }//확인용
        return array_story;
    }

    public char[] char_split(){

        array_story2 = story.toCharArray();

        for(int i = 0; i<array_story2.length; i ++){
            array_story2[i] = (story.charAt(i));
            System.out.println(array_story2);
        }
        return array_story2;
    }


}
