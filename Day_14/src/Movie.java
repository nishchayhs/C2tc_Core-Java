import java.util.*;

abstract class Movie{

String title;

abstract void setTitle(String s);

}

class Mymovie extends Movie{

void setTitle(String s){

title = s;

}

String getTitle(){

return title;

}

} 
