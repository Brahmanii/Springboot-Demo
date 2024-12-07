@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PutMapping("/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable Long id, @RequestBody Customer updatedCustomer) {
        Customer updatedCustomer = customerService.updateCustomer(id, updatedCustomer);
        return ResponseEntity.ok(updatedCustomer);
    }
}
