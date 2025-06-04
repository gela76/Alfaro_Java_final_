student_id = [] 

while True:
    current_id = input("Enter your id (or type 'exit' to finish): ")
    if current_id.lower() == 'exit':
        break

    programming_2 = float(input("Enter your programming 2 grade: "))
    itpe_1 = float(input("Enter your ITPE 1 grade: "))
    ns_1 = float(input("Enter your NS 1 grade: "))
    english = float(input("Enter your English grade: "))
    ite_math_1 = float(input("Enter your MATH 1 grade: "))

    print("\n--- STUDENT FINAL GRADES ---")
    print(f"Student Id: {current_id}")
    print(f"Programming 2 grade: {programming_2}")
    print(f"ITPE 1 grade: {itpe_1}")
    print(f"NS 1 Grade: {ns_1}")
    print(f"English Grade: {english}")
    print(f"Ite math 1 Grade: {ite_math_1}")

    grade_average = (programming_2 + itpe_1 + ns_1 + english + ite_math_1) / 5
    print(f"Grade Average: {grade_average}")

    if grade_average >= 60:
        result = "passed"
    else:
        result = "failed"
    print(f"Results of Grades: {result}")

    student_id.append(current_id)  

print("\nAll student IDs entered:")
for ids in student_id:
    print(ids)
