class TestView < ApplicationView
  set_java_class 'test.Test'

  map :view => "card_pane.text", :model=>:current_card, :using => [:to_html, nil]

  define_signal :name => :update_edit, :handler => :toggle_edit_button
  define_signal :name => :clear_text, :handler => :clear_text_pane

  def toggle_edit_button model, transfer
    edit_indicator.selected = transfer[:editing]
  end

  def clear_text_pane model, transfer
    card_pane.text = ""
  end

  def to_html raw_text
    RedCloth.new(raw_text).to_html
  end

end
