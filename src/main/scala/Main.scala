package example

import scala.util.Random

object Main extends App {

  // Функция генерации случайного списка
  def generateRandomList(size: Int, maxValue: Int): List[Int] = {
    List.fill(size)(Random.nextInt(maxValue))
  }

  // Функция вычисления среднего значения
  def calculateAverage(nums: List[Int]): Double = {
    nums.sum.toDouble / nums.length
  }

  // Функция нахождения элементов, отличающихся от среднего на 5
  def elementsDiffFromAverage(nums: List[Int], avg: Double): List[Int] = {
    nums.filter(num => math.abs(num - avg) >= 5)
  }

  // Функция для подсчета таких элементов
  def countElements(nums: List[Int], avg: Double): Int = {
    elementsDiffFromAverage(nums, avg).length
  }

  // Генерация случайного списка из 20 элементов с максимальным значением 100
  val randomList = generateRandomList(20, 100)

  // Вычисляем среднее
  val avg = calculateAverage(randomList)

  // Считаем количество элементов, отличающихся от среднего на 5
  val count = countElements(randomList, avg)

  // Вывод результатов
  println(s"Случайный список: $randomList")
  println(s"Среднее значение: $avg")
  println(s"Количество элементов, отличающихся от среднего на 5: $count")
}