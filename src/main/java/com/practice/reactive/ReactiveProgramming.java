package com.practice.reactive;

import rx.Observable;
import rx.Subscriber;

public class ReactiveProgramming {
	public static void main(String[] args) {
		// defining the source
		Observable<Integer> source = Observable.range(1, 5);


		// defining the consumer
		Subscriber<Integer> consumer = new Subscriber<Integer>() {
			@Override
			public void onCompleted() {
				System.out.println("Completed");
			}

			@Override
			public void onError(Throwable throwable) {
				System.out.println("Error");
			}

			@Override
			public void onNext(Integer integer) {
				System.out.println("Processing data : "+integer);
			}
		};

		//source.subscribe(consumer);
		source.subscribe(data -> System.out.println("Processing : "+data),
				(throwable) -> System.out.println("Some error occured"),
				() -> System.out.println("Process Completed"));
	}
}
