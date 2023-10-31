@main
def main(): Unit = {

  def printSentenceWithMaxWords(text: String): Unit = {
    val sentences = text.split("[.!?]+") //разделяем текст на предложения
    val maxWordsSentence = sentences
      //создаем словарь, где ключ = предложение, c убранными пробелами в начале и конце;
      //значение = кол-во слов из предложения
      .map(sentence => (sentence.trim, sentence.trim.split("[,; :-]+").length))
      //нахождение элемента с максимальным количеством слов
      .maxBy(_._2)._1
    println(maxWordsSentence)


  }

  // Пример использования:
  val text = "Это предложение содержит: максимальное количество слов. А это - другое предложение. И еще одно."
  printSentenceWithMaxWords(text)

}