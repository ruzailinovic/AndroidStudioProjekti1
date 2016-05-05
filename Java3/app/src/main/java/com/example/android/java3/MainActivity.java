package com.example.android.java3;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

import com.example.android.java3.R;

import java.text.NumberFormat;
/**
 * metoda koja prikazuje naruđbu naručene kave.
 */
public class MainActivity extends ActionBarActivity {
    int kolicina = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * metoda se poziva pritiskom na dugme.
     */
    public void submitOrders(View view) {

       int cijena = racunanjeCijene();
        String porukaCijene = "Cijena: " + cijena + "kn";
        displayMassage(porukaCijene);

    }

    /**
     * metoda koja prikazuje količinu na ekranu.
     */
    private void displayMassage(String massage) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(massage);

    }



    /**
     * Računanje cijene naruđbe .
     *
     * @param kolicina je broj naručenih kava
     */



    private int racunanjeCijene() {
        int cijena = kolicina * 6;
        return cijena;
    }

    /**
     * metoda koja prikazuje cijenu na ekranu.
     */


    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /**
     * metoda za dugme plus.
     */
    public void increment(View view) {
        kolicina = kolicina + 1;
        display(kolicina);
    }

    /**
     * metoda za dugme minus.
     */
    public void decrement(View view) {
        kolicina = kolicina - 1;
        display(kolicina);
    }

}