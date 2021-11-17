package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
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
        gridArray[0][0] = 1;
        Toast.makeText(this, "you clicked button 1", Toast.LENGTH_SHORT).show();

        drawCondition();

        winCondition();

    }//end function for the Button 1

    public void topMiddleClick(View v)
    {
        gridArray[0][1] = 1;
        Toast.makeText(this, "you clicked button 2", Toast.LENGTH_SHORT).show();

        drawCondition();

        winCondition();

    }//end function for the Button 2

    public void topRightClick(View v)
    {
        gridArray[0][2] = 1;
        Toast.makeText(this, "you clicked button 3", Toast.LENGTH_SHORT).show();

        drawCondition();

        winCondition();

    }//end function for the Button 3

    public void middleLeftClick(View v)
    {
        gridArray[1][0] = 1;
        Toast.makeText(this, "you clicked button 4", Toast.LENGTH_SHORT).show();


        drawCondition();

        winCondition();

    }//end function for the Button 4

    public void middleMiddleClick(View v)
    {
        gridArray[1][1] = 1;
        Toast.makeText(this, "you clicked button 5", Toast.LENGTH_SHORT).show();


        drawCondition();

        winCondition();

    }//end function for the Button 5

    public void middleRightClick(View v)
    {
        gridArray[1][2] = 1;
        Toast.makeText(this, "you clicked button 6", Toast.LENGTH_SHORT).show();

        drawCondition();

        winCondition();

    }//end function for the Button 6

    public void bottomLeftClick(View v)
    {
        gridArray[2][0] = 1;
        Toast.makeText(this, "you clicked button 7", Toast.LENGTH_SHORT).show();


        drawCondition();

        winCondition();

    }//end function for the Button 7

    public void bottomMiddleClick(View v)
    {
        gridArray[2][1] = 1;
        Toast.makeText(this, "you clicked button 8", Toast.LENGTH_SHORT).show();

        drawCondition();

        winCondition();

    }//end function for the Button 8

    public void bottomRightClick(View v)
    {
        gridArray[2][2] = 1;
        Toast.makeText(this, "you clicked button 9", Toast.LENGTH_SHORT).show();


        drawCondition();
    }//end function for the Button 9

    //draw condition (x = 1, o = 0)
    public void drawCondition()
    {
        playerTurn++;
        Log.i("count", "playerTurn count is " + playerTurn);
        if(playerTurn == 10)
        {
            Log.i("info", "This is a draw");
        }

    }

        winCondition();
    }//end function for the Button 9

    private int[][] fullGrid()
    {
        int[][]grid = new int[3][3];
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = 2;
            }
        }
        return grid;
    }//method to fill up the entire gridArray with the value of 2 to represent an empty board

    private void winCondition()
    {
        for(int i = 0; i < 3;i++)
        {
            if(gridArray[i][0]== 1 && gridArray[i][1]== 1 && gridArray[i][2]== 1)
            {
                //Toast.makeText(this, "X wins the game", Toast.LENGTH_SHORT).show();
            }
            else if(gridArray[0][i]==1 && gridArray[1][i]==1 && gridArray[2][i]==1)
            {

            }
            else if(gridArray[i][0]== 0 && gridArray[i][1]== 0 && gridArray[i][2]== 0)
            {

            }
            else if(gridArray[0][i]==0 && gridArray[1][i]==0 && gridArray[2][i]==0)
            {

            }
        }//end for loop to check for horizontal and vertical cases for wins

        if(gridArray[0][0]==0 && gridArray[1][1]==0 && gridArray[2][2]==0)
        {

        }//checks case for diagonal from top left to bottom right for if O wins
        else if(gridArray[0][2]==0 && gridArray[1][1]==0 && gridArray[2][0]==0)
        {

        }//checks case for diagonal from top right to bottom left for if 0 wins
        else if(gridArray[0][0]==1 && gridArray[1][1]==1 && gridArray[2][2]==1)
        {

        }//checks case for diagonal from top left to bottom right for if X wins
        else if(gridArray[0][2]==1 && gridArray[1][1]==1 && gridArray[2][0]==1)
        {

        }//checks case for diagonal from top right to bottom left for if X wins

    }//method to check for win cases after each turn only for values of X and O being 1 and 0


}