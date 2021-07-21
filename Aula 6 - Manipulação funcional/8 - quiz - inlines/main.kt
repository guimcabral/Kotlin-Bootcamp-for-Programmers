fun main(){
    val game = Game()

    while(true){
        print("Enter a direction: n/s/e/w: ")
        game.makeMove(readLine())
    }
}