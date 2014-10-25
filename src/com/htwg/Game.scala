package com.htwg

object Game {

  def main(args: Array[String]): Unit = {
    var input = ""
    var max_rows = 6;
    var max_cols = 7;
    var board = new Board(max_cols, max_rows)

    var rows = new Array[CellMap](max_rows)
    var columns = new Array[CellMap](max_cols)

    for (index <- 0 until 5) {
      rows(index) = new CellMap(max_cols)
      columns(index) = new CellMap(max_rows)
    }
    columns(6) = new CellMap(max_rows)

    for (column <- 0 until max_cols; row <- 0 until max_rows) {
      //board.cells(column)(row) = new Cell(column,row)
    }

    while (true) {
      input = readLine();

      input match {
        case "q" => {
          println("Game stoped!")
          return
        }
        case _ => {
          println("input!")
          input.toList.filter(c => c != ' ').map(c => c.toString.toInt) match {
            case column :: Nil => {
              board.add(column)
              print(board.toSting())
            }
            case _ => println("False Input!!!")

          }
        }
      }

    }

  }
}