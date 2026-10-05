use std::process::Command;

fn main() {
    println!("Hello ASL!");

    let output = Command::new("date")
        .arg("+%Y-%m-%d %H:%M:%S")
        .output()
        .expect("Failed to get current date");

    let date = String::from_utf8_lossy(&output.stdout);
    println!("Current Date: {}", date.trim());
}
