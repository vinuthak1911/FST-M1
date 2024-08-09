class Car:
    'This class represents a car'

    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelerate(self):
        print(self.manufacturer + " " + self.model + " is moving.")

    def stop(self):
        print(self.manufacturer + " " + self.model + " has stopped.")

car1 = Car("Mahindra", "xuv300", "2023", "Manual", "Grey")
car2 = Car("Skoda", "Laura", "2013", "Manual", "white")
car3 = Car("Renault", "Kwid", "2017", "Manual", "Olive")

car1.accelerate()
car1.stop()

car2.accelerate()
car2.stop()

car3.accelerate()
car3.stop()