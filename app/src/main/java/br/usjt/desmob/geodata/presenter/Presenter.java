package br.usjt.desmob.geodata.presenter;

/**
 * Created by asbonato on 04/11/17.
 */

public interface Presenter {
    void onCreate();
    void onPause();
    void onResume();
    void onDestroy();
}
