
var countTurn = 1
var playerTurn = "x"

fun main() {
    var table = arrayOf(
         arrayOf(" ","1", "2" ,"3")
        ,arrayOf("1" , "-" ,"-" ,"-")
        ,arrayOf("2" , "-" ,"-" ,"-")
        ,arrayOf("3" , "-" ,"-" ,"-")
    )
    while (!checkTurnEnd(countTurn) || checkWin(table)) {
        println(playerTurn)
        playerTurn = switchPlayer(playerTurn)
        countTurn ++
        }
    if(checkTurnEnd(countTurn)){
        println("*---- Draw ----*")
        clearTable(table)
        playerTurn = "x"
        countTurn = 1
    }


    showTable(table)
    print(checkWin(table))
}



fun switchPlayer(p:String) : String{
    if(  p == "x") {
        return "o"
    }else{
        return "x"
    }
}

fun checkTurnEnd(turn : Int) : Boolean = turn == 9

fun checkInput(s:String) : Boolean {
    return true
}

fun checkWin(table : Array<Array<String>>) : Boolean{
    //Win in Horizontal
    if(table[1][1] == table [1][2] && table[1][2] == table[1][3] && table[1][1] != "-"){
        print("Player ${table[1][1]} Win!!!")
        return true
    }else if (table[2][1] == table [2][2] && table[2][2] == table[2][3] && table[2][1] != "-"){
        print("Player ${table[2][1]} Win!!!")
        return true
    }else if (table[3][1] == table [3][2] && table[3][2] == table[3][3] && table[3][1] != "-"){
        print("Player ${table[3][1]} Win!!!")
        return true
    }
    //Win in vertical
    if(table[1][1] == table [2][1] && table[2][1] == table[3][1] && table[1][1] != "-"){
        print("Player ${table[1][1]} Win!!!")
        return true
    }else if (table[1][2] == table [2][2] && table[2][2] == table[3][2] && table[1][2] != "-"){
        print("Player ${table[1][2]} Win!!!")
        return true
    }else if (table[1][3] == table [2][3] && table[2][3] == table[3][3] && table[1][3] != "-"){
        print("Player ${table[1][3]} Win!!!")
        return true
    }

    return false
}

fun showTable (table : Array<Array<String>>) {
    for (i in table) {
        for (r in i){
            print("${r} ")
        }
        println()
    }
}

fun clearTable (table : Array<Array<String>>){
    for ( i in table.indices){
        for ( j in table[i].indices){
            table[i][j] = "-"
        }
    }
}