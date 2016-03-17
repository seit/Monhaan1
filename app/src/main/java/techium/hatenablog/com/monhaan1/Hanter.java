package techium.hatenablog.com.monhaan1;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by uenakamasanobu on 2016/03/03.
 */
public class Hanter extends BaseObservable {
    private String name;
    private String gender;

    public Hanter(String name, String gender){
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    @Bindable
    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
        notifyPropertyChanged(techium.hatenablog.com.monhaan1.BR.gender);
    }

}
