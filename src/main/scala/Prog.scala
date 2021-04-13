object Prog {
	import akka.actor._

	class MyActor extends Actor {
		def receive = {
			case msg => println("Otrzymałem komunikat: „" + msg.toString + "”")
		}
	}

	def main(args: Array[String]): Unit = {
		println("Hello Akka!")
		val system = ActorSystem("system")
		val john = system.actorOf(Props[MyActor](), "john")
		john ! 123
	}
}
