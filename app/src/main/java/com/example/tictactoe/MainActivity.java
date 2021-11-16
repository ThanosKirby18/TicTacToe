package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //This is the 2D Array that will hold the values of the tic-tac-toe board
    private int [][]gridArray = fullGrid();
    int playerTurn = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void topLeftClick(View v)
    {
        Toast.makeText(this, "you clicked button 1", Toast.LENGTH_SHORT).show();
        gridArray[0][0] = 1;

    }//end function for the Button 1

    public void topMiddleClick(View v)
    {
        gridArray[0][1] = 1;
        Toast.makeText(this, "you clicked button 2", Toast.LENGTH_SHORT).show();
    }//end function for the Button 2

    public void topRightClick(View v)
    {
        gridArray[0][2] = 1;
        Toast.makeText(this, "you clicked button 3", Toast.LENGTH_SHORT).show();
    }//end function for the Button 3

    public void middleLeftClick(View v)
    {
        gridArray[1][0] = 1;
        Toast.makeText(this, "you clicked button 4", Toast.LENGTH_SHORT).show();
    }//end function for the Button 4

    public void middleMiddleClick(View v)
    {
        gridArray[1][1] = 1;
        Toast.makeText(this, "you clicked button 5", Toast.LENGTH_SHORT).show();
    }//end function for the Button 5

    public void middleRightClick(View v)
    {
        gridArray[1][2] = 1;
        Toast.makeText(this, "you clicked button 6", Toast.LENGTH_SHORT).show();
    }//end function for the Button 6

    public void bottomLeftClick(View v)
    {
        gridArray[2][0] = 1;
        Toast.makeText(this, "you clicked button 7", Toast.LENGTH_SHORT).show();
    }//end function for the Button 7

    public void bottomMiddleClick(View v)
    {
        gridArray[2][1] = 1;
        Toast.makeText(this, "you clicked button 8", Toast.LENGTH_SHORT).show();
    }//end function for the Button 8

    public void bottomRightClick(View v)
    {
        gridArray[2][2] = 1;
        Toast.makeText(this, "you clicked button 9", Toast.LENGTH_SHORT).show();
    }//end function for the Button 9

    private int[][] fullGrid()
    {
        int[][]grid = new int[3][3];
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                grid[i][j] = 2;
            }
        }
        return grid;
    }//method to fill up the entire gridArray with the value of 2 to represent an empty board



}