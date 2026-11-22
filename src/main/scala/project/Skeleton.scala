package project

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._

object Skeleton {
    def main(args: Array[String]): Unit = {
        require(
            args.length == 1,
            "Usage: Skeleton <input-jsonl-path>"
        )
        
        println("This is an empty project.")
    }
}
