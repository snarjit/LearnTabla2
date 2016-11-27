package narjitsingh.learntabla;

import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by SurnarSingh on 8/9/16.
 */
public class TaalList {
    private String name;
    private String beats;
    private int iconId;
    private ImageButton button;
    private ImageButton video;
    private String taal_type;




    public TaalList(String taal_type, String name, ImageButton button, ImageButton video) {
        this.taal_type =taal_type;
        this.name= name;
        this.button =button;
        this.video = video;

    }

    public String getName() {
        return name;
    }

public String getTaal_type(){
    return taal_type;
}
    public int getIconId() {
        return iconId;
    }

public ImageButton getButton(){
    return button;
}
public ImageButton getVideo(){
    return video;
}

}


