# java-8
Java 8 Feature
-  Lambda expressions
-  Streams
-  Functional Interfaces 
	* An Interface that contains exactly one abstract method
	* Any number of default, static methods
	* Also known as Single Abstract Method Interfaces
	* A functional interface can extends another interface only when it does not have any abstract method. otherwise compiler give error
	* Functional Interfaces Can Be Implemented by a Lambda Expression
	* Ex
		1. Predicate: Abstract method test which gives a Boolean value as a result for the specified argument. 
		public interface Predicate
		{
		   public boolean test(T  t);
		}
-  Default methods
	* Refer workspace 
-  Optional 
	* Optional in java.util package. It is used to represent a value is present or absent. 
	* Like Collections and arrays, it is also a Container to hold at most one value.
    * Advantages
		1. Null checks are not required.
		2. No more NullPointerException at run-time.
		3. No more Boiler plate code
	* Ex
		1. Optional.ofNullable() returns a Non-empty Optional if a value present in the given object. Otherwise returns empty Optional.
		2. Optionaal.empty() method is useful to create an empty Optional object.
		3. Optional.isPresent() returns true if the given Optional object is non-empty. Otherwise it returns false
		
-  CompletableFuture
	* Limitation of Future 
		1. There is no way to complete the future. we can only attempt to cancel the task.
		2. The get() method in the Future Interface is blocking operation
		3. No support for exception handling
		4. Multiple futures cannot be chained together
	* All above limitation address into completableFuture 
		-  Complete(): Let’s you manually complete the Future with the given value
		-  To chain several computations or tasks to achieve end result, there are few method
			thenAccept(),thenApply(),thenCombine(),thenRun(),whenComplete()
		- completeExceptionally() & exceptionally(): Used for exception handing

JVM Level Changes
- Ahead of Time : AOT
- Meta space 
- Parallel GC default in JDK 8
- Java SE 8u131 and JDK 9 are expected to improve the Java running in Docker
	* number of GC threads,JIT compiler threads should be set transparently  base on host configuration . (if JVM argument is not specified)
		a. -XX:+UnlockExperimentalVMOptions 
		b. -XX:+UseCGroupMemoryLimitForHeap.
	* setting up above to JVM argument .JVM see containers configuration instead of host configuration (on which machine container deployed)
