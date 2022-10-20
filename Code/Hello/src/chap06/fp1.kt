package chap06

var x = 0
var y = 0

fun main() {

    var board = Array<CharArray>(3) {CharArray(3)} // 3x3 배열
    initBoard(board)

    var player = arrayOf("Tic", "Tac")
    var mark = arrayOf('X', 'O')

    play(board, player, mark)

}

// 보드판 초기화 함수
fun initBoard(board: Array<CharArray>) {
    for (y in board.indices) {
        for (x in board.indices) {
            board[y][x] = ' ' // 반복문을 통해 보드판에 ' ' 값 대입
        }
    }
}

// 보드판 출력 함수
fun printBoard(board: Array<CharArray>) {
    // 첫 번째 줄
    print("  ")
    for (i in 0..2) print("$i ")
    println()
    // 두 번째 줄 밑 플레이어 보드
    for (y in board.indices) {
        print("$y ")
        for (x in board.indices) {
            print("${board[y][x]}")
            if (x!=2) print("|")
        }
        // 위치표시줄
        println()
        print("  ")
        if(y!=2) {
            for (i in board.indices) {
                print("-")
                if (i != 2) print("+")
            }
            println()
        }
    }
}

// 입력한 x,y가 격자 범위에 있는지 검사
val isInRange: (Int, Int) -> Boolean = { x,y -> x in 0..2 && y in 0..2 }

// 입력한 x,y 좌표 상이 비어있는지 검사
fun isValid(board: Array<CharArray>, x: Int, y: Int): Boolean {
    return isInRange(x,y) && board[y][x] == ' '
}

// 플레이어 입력 함수
fun playerInput(board: Array<CharArray>): Boolean {
    val input = readLine()!!.split(',')
    y = input[0].toInt()
    x = input[1].toInt()
    if (!isValid(board,x,y)) return false
    return true

}

// 승리조건 함수
fun winOver(board: Array<CharArray>, x: Int, y: Int): Boolean {
    var dx = arrayOf(-1, 1, 0, 0, -1, 1, -1, 1)
    var dy = arrayOf(0, 0, 1, -1, -1, 1, 1, -1)

    var count = 1

    for (d in 1..2) {
        for (index in 0..7) {
            var cx = x + dx[index] * d
            var cy = y + dy[index] * d

            if (!isInRange(cx,cy))
                continue
            if (board[cy][cx] == board[y][x])
                count++
        }
    }
    if (count == 3) return true
    return false
}

// 플레이 함수
fun play(board: Array<CharArray>, player: Array<String>, mark: Array<Char>) {
    var round = 0
    var turn = 0

    while(true) {
        println("${round + 1}번째 턴")
        printBoard(board)
        print("${player[turn]}은 값을 입력하시오 ")
        if (!playerInput(board))
            continue
        board[y][x] = mark[turn]
        round++

        // 무승부 시 게임 종료
        if (round == 9) {
            println("무승부")
            break
        }

        //승리 조건 달성 시 게임 종료
        if (winOver(board, x,y)) {
            println("player ${player[turn + 1]} Win!")
            break
        }
        turn = (turn + 1) % 2
    }
}