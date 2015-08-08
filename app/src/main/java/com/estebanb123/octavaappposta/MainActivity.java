//Animations and Transitions tuto
package com.estebanb123.octavaappposta;


        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.view.MotionEvent;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.RelativeLayout;
        import android.transition.TransitionManager;

public class MainActivity extends AppCompatActivity {

    ViewGroup maguiLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        maguiLayout = (ViewGroup) findViewById(R.id.maguiLayout);

        maguiLayout.setOnTouchListener(new RelativeLayout.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                moverboton();
                return true;
            }
        });

    }

    public void moverboton() {
        View maguiBoton = findViewById(R.id.maguiBoton);

        //Para que haga una transicion
        TransitionManager.beginDelayedTransition(maguiLayout);

        //Cambia la posision del boton
        RelativeLayout.LayoutParams reglasPosicion = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        reglasPosicion.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, RelativeLayout.TRUE);
        reglasPosicion.addRule(RelativeLayout.ALIGN_PARENT_RIGHT, RelativeLayout.TRUE);

        maguiBoton.setLayoutParams(reglasPosicion);

        //Cambia el tamaño del boton
        ViewGroup.LayoutParams reglasTamanio = maguiBoton.getLayoutParams();
        reglasTamanio.height = 300;
        reglasTamanio.width = 450;

        maguiBoton.setLayoutParams(reglasTamanio);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}