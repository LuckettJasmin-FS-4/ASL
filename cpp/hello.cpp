#include <iostream>
#include <ctime>
#include <iomanip>

int main() {
    std::time_t now = std::time(nullptr);

    std::cout << "Hello ASL!" << std::endl;
    std::cout << "Current Date: "
              << std::put_time(std::localtime(&now), "%Y-%m-%d %H:%M:%S")
              << std::endl;

    return 0;
}
