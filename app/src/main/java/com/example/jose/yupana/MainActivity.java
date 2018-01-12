package com.example.jose.yupana;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.jose.yupana.databinding.ActivityMainBinding;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;


    private double valueOne = Double.NaN;
    private double valueTwo;

    private DecimalFormat decimalFormat;
    private double numero = 0;
    private double numero2 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        decimalFormat = new DecimalFormat("#.##########");

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.radioButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //computeCalculation();
                if(binding.radioButton1.isChecked()) {
                    numero++;
                    binding.radioButton1.setChecked(true);
                }else{
                    numero--;
                    binding.radioButton1.setChecked(false);
                }
                binding.infoTextView1.setText(decimalFormat.format(numero) );
                //binding.editText.setText(null);
            }
        });
        binding.radioButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //computeCalculation();
                numero++;
                binding.infoTextView1.setText(decimalFormat.format(numero) );
                //binding.editText.setText(null);
            }
        });
        binding.radioButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //computeCalculation();
                numero++;
                binding.infoTextView1.setText(decimalFormat.format(numero) );
                //binding.editText.setText(null);
            }
        });
        binding.radioButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //computeCalculation();
                numero++;
                binding.infoTextView1.setText(decimalFormat.format(numero) );
                //binding.editText.setText(null);
            }
        });
        binding.radioButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //computeCalculation();
                numero++;
                binding.infoTextView1.setText(decimalFormat.format(numero) );
                //binding.editText.setText(null);
            }
        });
        binding.radioButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //computeCalculation();
                numero++;
                binding.infoTextView1.setText(decimalFormat.format(numero) );
                //binding.editText.setText(null);
            }
        });
        binding.radioButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //computeCalculation();
                numero++;
                binding.infoTextView1.setText(decimalFormat.format(numero) );
                //binding.editText.setText(null);
            }
        });binding.radioButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //computeCalculation();
                numero++;
                binding.infoTextView1.setText(decimalFormat.format(numero) );
                //binding.editText.setText(null);
            }
        });binding.radioButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //computeCalculation();
                numero++;
                binding.infoTextView1.setText(decimalFormat.format(numero) );
                //binding.editText.setText(null);
            }
        });
        binding.radioButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //computeCalculation();
                numero++;
                binding.infoTextView1.setText(decimalFormat.format(numero) );
                //binding.editText.setText(null);
            }
        });


        binding.radioButton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //computeCalculation();

                numero+=10;
                binding.infoTextView1.setText(decimalFormat.format(numero) );
                //binding.editText.setText(null);
            }
        });
        binding.radioButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //computeCalculation();
                numero+=10;
                binding.infoTextView1.setText(decimalFormat.format(numero) );
                //binding.editText.setText(null);
            }
        });
        binding.radioButton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //computeCalculation();
                numero+=10;
                binding.infoTextView1.setText(decimalFormat.format(numero) );
                //binding.editText.setText(null);
            }
        });
        binding.radioButton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //computeCalculation();
                numero+=10;
                binding.infoTextView1.setText(decimalFormat.format(numero) );
                //binding.editText.setText(null);
            }
        });
        binding.radioButton15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //computeCalculation();
                numero+=10;
                binding.infoTextView1.setText(decimalFormat.format(numero) );
                //binding.editText.setText(null);
            }
        });
        binding.radioButton16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //computeCalculation();
                numero+=10;
                binding.infoTextView1.setText(decimalFormat.format(numero) );
                //binding.editText.setText(null);
            }
        });
        binding.radioButton17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //computeCalculation();
                numero+=10;
                binding.infoTextView1.setText(decimalFormat.format(numero) );
                //binding.editText.setText(null);
            }
        });binding.radioButton18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //computeCalculation();
                numero+=10;
                binding.infoTextView1.setText(decimalFormat.format(numero) );
                //binding.editText.setText(null);
            }
        });binding.radioButton19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //computeCalculation();
                numero+=10;
                binding.infoTextView1.setText(decimalFormat.format(numero) );
                //binding.editText.setText(null);
            }
        });
        binding.radioButton20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //computeCalculation();
                numero+=10;
                binding.infoTextView1.setText(decimalFormat.format(numero) );
                //binding.editText.setText(null);
            }
        });
        binding.radioButtonUnit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //computeCalculation();

                numero2++;
                binding.infoTextView.setText(decimalFormat.format(numero2) );
                //binding.editText.setText(null);
            }
        });
        binding.radioButtonUnit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //computeCalculation();
                numero2++;
                binding.infoTextView.setText(decimalFormat.format(numero) );
                //binding.editText.setText(null);
            }
        });
        binding.radioButtonUnit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //computeCalculation();
                numero2++;
                binding.infoTextView.setText(decimalFormat.format(numero2) );
                //binding.editText.setText(null);
            }
        });
        binding.radioButtonUnit4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //computeCalculation();
                numero2++;
                binding.infoTextView.setText(decimalFormat.format(numero2) );
                //binding.editText.setText(null);
            }
        });
        binding.radioButtonUnit5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //computeCalculation();
                numero2++;
                binding.infoTextView.setText(decimalFormat.format(numero2) );
                //binding.editText.setText(null);
            }
        });
        binding.radioButtonUnit6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //computeCalculation();
                numero2++;
                binding.infoTextView.setText(decimalFormat.format(numero2) );
                //binding.editText.setText(null);
            }
        });
        binding.radioButtonUnit7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //computeCalculation();
                numero2++;
                binding.infoTextView.setText(decimalFormat.format(numero2) );
                //binding.editText.setText(null);
            }
        });binding.radioButtonUnit8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //computeCalculation();
                numero2++;
                binding.infoTextView.setText(decimalFormat.format(numero2) );
                //binding.editText.setText(null);
            }
        });binding.radioButtonUnit9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //computeCalculation();
                numero2++;
                binding.infoTextView.setText(decimalFormat.format(numero2) );
                //binding.editText.setText(null);
            }
        });



        binding.radioButtonDeci1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //computeCalculation();

                numero2+=10;
                binding.infoTextView.setText(decimalFormat.format(numero2) );
                //binding.editText.setText(null);
            }
        });
        binding.radioButtonDeci2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //computeCalculation();
                numero2+=10;
                binding.infoTextView.setText(decimalFormat.format(numero2) );
                //binding.editText.setText(null);
            }
        });
        binding.radioButtonDeci3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //computeCalculation();
                numero2+=10;
                binding.infoTextView.setText(decimalFormat.format(numero2) );
                //binding.editText.setText(null);
            }
        });
        binding.radioButtonDeci4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //computeCalculation();
                numero2+=10;
                binding.infoTextView.setText(decimalFormat.format(numero2) );
                //binding.editText.setText(null);
            }
        });
        binding.radioButtonDeci5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //computeCalculation();
                numero2+=10;
                binding.infoTextView.setText(decimalFormat.format(numero2) );
                //binding.editText.setText(null);
            }
        });
        binding.radioButtonDeci6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //computeCalculation();
                numero2+=10;
                binding.infoTextView.setText(decimalFormat.format(numero2) );
                //binding.editText.setText(null);
            }
        });
        binding.radioButtonDeci7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //computeCalculation();
                numero2+=10;
                binding.infoTextView.setText(decimalFormat.format(numero2) );
                //binding.editText.setText(null);
            }
        });binding.radioButtonDeci8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //computeCalculation();
                numero2+=10;
                binding.infoTextView.setText(decimalFormat.format(numero2) );
                //binding.editText.setText(null);
            }
        });binding.radioButtonDeci9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //computeCalculation();
                numero2+=10;
                binding.infoTextView.setText(decimalFormat.format(numero2) );
                //binding.editText.setText(null);
            }
        });

    }
    //private void computeCalculation() {
    //    if(numero!=0) {

     //   }

    //}
}
